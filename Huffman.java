package cs2321;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import net.datastructures.*;
public class Huffman {

	LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<Integer>();

	public int compress(String inputFile, String outputFile) throws IOException {

		BufferedReader reader = null;
		BufferedWriter writer = null;
		BufferedReader data = null;
		int size = 0;
		try {
			Integer character;
			reader = new BufferedReader(new FileReader(inputFile));
			writer = new BufferedWriter(new FileWriter(outputFile));
			data = new BufferedReader(new FileReader(inputFile));
			int[] freq = new int[256];

			while ((character = reader.read()) != null) {
				if (character < 1)
					break;
				if (character > 0 && character < 257){
				freq[character]++;
				}
			}
			tree = buildTree(freq);
			Position<Integer> p = tree.root();
			String[] code = new String[256];
			buildcode(p, code, "");
			treeWriter(p, writer);
			while ((character = data.read()) != null) {
				if (character < 1)
					break;
				if (character > 0 && character < 257){
				String c = code[character];
				size += c.length();
				writer.write(c);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			reader.close();
			writer.close();
			data.close();
		}
		return size;
	}

	private void treeWriter(Position<Integer> p, BufferedWriter writer) throws IOException {
		if (tree.isExternal(p)) {
			writer.write("10");
			int value = p.getElement();
			if (value < 64) {
				writer.write("0");
			}
			if (value < 32) {
				writer.write("0");
			}
			if (value < 16) {
				writer.write("0");
			}
			writer.write(Integer.toBinaryString(value));
		} else {
			writer.write("0");
			treeWriter(tree.left(p), writer);
			treeWriter(tree.right(p), writer);
		}

	}

	private void buildcode(Position<Integer> p, String[] code, String s) {
		if (!tree.isExternal(p)) {
			buildcode(tree.left(p), code, s + "0");
			buildcode(tree.right(p), code, s + "1");
		} else {
			code[p.getElement()] = s;
		}
	}

	private LinkedBinaryTree<Integer> buildTree(int[] freq) {
		HeapPQ<Integer, LinkedBinaryTree<Integer>> pq = new HeapPQ<Integer, LinkedBinaryTree<Integer>>();
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 0) {
				LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<Integer>();
				tree.addRoot(i);
				pq.insert(freq[i], tree);
			}
		}

		while (pq.size() > 1) {
			LinkedBinaryTree<Integer> t = new LinkedBinaryTree<Integer>();
			Entry<Integer, LinkedBinaryTree<Integer>> t1 = pq.removeMin();
			Entry<Integer, LinkedBinaryTree<Integer>> t2 = pq.removeMin();
			t.addRoot(t1.getKey() + t2.getKey());
			t.attach(t.root(), t1.getValue(), t2.getValue());
			pq.insert(t.root().getElement(), t);
		}

		LinkedBinaryTree<Integer> x = pq.removeMin().getValue();
		return x;
	}

	BufferedReader reader = null;
	public void decode(String inputFile, String outputFile) throws IOException {
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(inputFile));
			writer = new BufferedWriter(new FileWriter(outputFile));
			LinkedBinaryTree<Character> Dtree = buildCodeTree();
			int b = reader.read() - 48;
			while (b == 0 || b == 1) {
				Position<Character> p = Dtree.root();
				while (Dtree.isInternal(p)) {
					if (b == 0) {
						p = Dtree.left(p);
					} else {
						p = Dtree.right(p);
					}
					b = reader.read() - 48;
				}
				Character d = p.getElement();
				writer.write(d);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			reader.close();
			writer.close();
		}

		return;
	}

	private LinkedBinaryTree<Character> buildCodeTree() throws IOException {
		int b = reader.read() - 48;
		if (b == 1) {
			String letter = "";
			for (int i = 0; i < 8; i++) {
				letter += String.valueOf(reader.read() - 48);
			}
			LinkedBinaryTree<Character> Dtree = new LinkedBinaryTree<Character>();
			int c = Integer.parseInt(letter, 2);
			char charecter = (char) c;

			Dtree.addRoot(charecter);

			return Dtree;
		} else {

			LinkedBinaryTree<Character> t1 = buildCodeTree();
			LinkedBinaryTree<Character> t2 = buildCodeTree();
			LinkedBinaryTree<Character> Dtree = new LinkedBinaryTree<Character>();
			Dtree.addRoot(' ');
			Dtree.attach(Dtree.root(), t1, t2);
			return Dtree;
		}
	}

	public static void main(String[] args) throws IOException {
		Huffman huffman = new Huffman();
		System.out.println(huffman.compress("artical5", "compression2"));
		huffman.decode("compression2", "cat");

		String[] inputData = { "ab.txt", "abra.txt", "tinytinyTale.txt", "medTale.txt", "tale.txt" };
		int[] length = { 5, 28, 128, 23599, 3043613 };

		for (int i = 0; i < inputData.length; i++) {
			System.out.println("processing " + inputData[i]);
			int l = huffman.compress(inputData[i], inputData[i] + ".compressed.new");
			System.out.println(" file " + inputData[i] + " length is " + l);
			if (length[i] != l) {
				System.out.println("wrong length");
			} else {
				System.out.println("correct length");
			}

			huffman.decode(inputData[i] + ".compressed", inputData[i] + ".original");

		}

	}
}
