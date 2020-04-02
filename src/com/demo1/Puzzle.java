package com.demo1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Puzzle {
	public static void main(String args[]) {

		String numberOfTestCases = null;
		String numberOfPlayers = null;

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		String name = "";

		int[] villans = null;

		int[] players = null;

		int i = 0;

		while (!name.equals("stop")) {
			try {
				if (i == 0) {
					numberOfTestCases = br.readLine();
				}

				if (i == 1) {

					numberOfPlayers = br.readLine();
				}

				if (i == 2) {
					String[] arr;
					arr = br.readLine().split(" ");
					villans = new int[arr.length];
					for (int j = 0; j < arr.length; j++) {
						villans[j] = Integer.parseInt(arr[j]);
					}
				}

				if (i == 3) {
					String[] arr1;
					arr1 = br.readLine().split(" ");
					players = new int[arr1.length];
					for (int j = 0; j < arr1.length; j++) {
						players[j] = Integer.parseInt(arr1[j]);
					}

				}

				if (i == 4) {
					name = "stop";
				}

				i++;

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			br.close();
			r.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("Number of Test Cases=" + numberOfTestCases);

		System.out.println("Number of Players=" + numberOfPlayers);

		System.out.print("Number of Villans=");

		for (int v : villans) {
			System.out.print(v + " ");
		}

		System.out.println("\n");

		System.out.print("Sorted Villans=");

		villans = sort(villans);

		for (int p : villans) {
			System.out.print(p + " ");
		}

		System.out.println("\n");

		System.out.print("Number of Players=");

		for (int p : players) {
			System.out.print(p + " ");
		}

		// Check for if a player is just greater than its villan

		int[] vp = new int[villans.length];

		boolean flag = false;

		for (int h = 0; h < players.length; h++) {
			int player = players[h];
			for (int g = 0; g < villans.length; g++) {
				if (villans[g] > player) {
					if (g == 0) {
						flag = true;
						break;
					} else {
						vp[h] = villans[g - 1];
						villans[g - 1] = -1;
						break;
					}
				} else {
					if (g + 1 == villans.length) {
						vp[h] = villans[g];
						villans[g] = -1;
						break;
					}
				}
			}

			if (flag) {
				break;
			}
		}

		System.out.println("\n");

		System.out.println("Remaining Villans-");

		for (int m = 0; m < villans.length; m++) {
			System.out.println(villans[m] + " ");
		}

		System.out.println("\n");

		for (int m = 0; m < vp.length; m++) {
			System.out.println("Player " + players[m] + " killed villan " + vp[m]);
		}

		for (int v : villans) {
			if (v > 0) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("Lost");
		} else {
			System.out.println("WIN");
		}
	}

	private static int[] sort(int[] villans) {
		for (int p = villans.length; p > 0; p--) {
			for (int j = 0; j < p; j++) {
				if (j + 1 < p && villans[j] > villans[j + 1]) {
					int temp = villans[j];
					villans[j] = villans[j + 1];
					villans[j + 1] = temp;
				}
			}
		}

		return villans;
	}
}
