package basics;

enum LevelDifficulty {
	EASY, MEDIUM, HARD
}

public class EnumEx {

	public static void main(String[] args) {

		LevelDifficulty lvl = LevelDifficulty.EASY;

		switch (lvl) {
		case EASY:
			System.out.println("Level difficulty is : Easy ! ");
			break;
		case MEDIUM:
			System.out.println("Level difficulty is : Medium ! ");
			break;
		case HARD:
			System.out.println("Level difficulty is : Hard ! ");
			break;

		}

	}
}
