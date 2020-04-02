package com.demo.datastructure;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'longestChain' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * STRING_ARRAY words as parameter.
	 */

	private static int findWordChainLength(String word, HashSet<String> words, HashMap<String, Integer> wordToLongestChain) {
		int curChainLen = 0;

		for (int i = 0; i < word.length(); i++) {
			String nextWord = word.substring(0, i) + word.substring(i + 1);
			if (words.contains(nextWord)) {
				if (wordToLongestChain.containsKey(nextWord)) {
					curChainLen = Math.max(curChainLen, wordToLongestChain.get(nextWord));
				} else {
					int nextWordChainLen = findWordChainLength(nextWord, words, wordToLongestChain);
					curChainLen = Math.max(curChainLen, nextWordChainLen + 1);
				}
			}
		}

		return curChainLen;
	}

	public static int longestChain(List<String> wordsList) {

		if (null == wordsList || wordsList.isEmpty()) {
			return 0;
		}

		int maxChainLen = 0;

		HashSet<String> words = new HashSet<>(wordsList);
		HashMap<String, Integer> wordToLongestChain = new HashMap<>();

		for (String word : wordsList) {
			if (maxChainLen > word.length()) {
				continue;
			}
			int curChainLen = findWordChainLength(word, words, wordToLongestChain) + 1;
			wordToLongestChain.put(word, curChainLen);
			maxChainLen = Math.max(maxChainLen, curChainLen);
		}
		return maxChainLen;

	}

	private static int processWord(String word, List<String> allWords) {
		if (word.length() == 1)
			return 1;

		Stack<String> wordsStack = new Stack<String>();
		wordsStack.add(word);

		int startIndex = 0;
		int endIndex = 1;

		while (!wordsStack.isEmpty()) {
			String currentWord = wordsStack.peek();

			if (endIndex > currentWord.length()) {
				break;
			}

			if (allWords.contains(currentWord)) {
				StringBuilder wordBuilder = new StringBuilder(currentWord);
				wordBuilder.delete(startIndex, endIndex);
				wordsStack.add(wordBuilder.toString());
			} else {
				wordsStack.pop();
				startIndex++;
				endIndex++;
			}
		}

		return wordsStack.size();
	}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int wordsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = new ArrayList<>();

        for (int i = 0; i < wordsCount; i++) {
            String wordsItem = bufferedReader.readLine();
            words.add(wordsItem);
        }

        int result = Result.longestChain(words);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}