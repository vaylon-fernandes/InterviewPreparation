package com.string;

public class RemoveColoredPiecesLeetCode2038 {
	public static boolean winnerOfGame(String colors) {
		int aliceMoves = 0, bobMoves = 0;

		for (int i = 1; i < colors.length() - 1; i++) {
			if (colors.charAt(i) == 'A' || colors.charAt(i - 1) == 'A' || colors.charAt(i + 1) == 'A') {
				aliceMoves++;
			}
			if (colors.charAt(i) == 'B' || colors.charAt(i - 1) == 'B' || colors.charAt(i + 1) == 'B') {
				bobMoves++;
			}
		}

		return aliceMoves > bobMoves;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(winnerOfGame("AAABABB"));
		System.out.println(winnerOfGame("AA"));
		System.out.println(winnerOfGame("ABBBBBBBAA"));
	}

}
