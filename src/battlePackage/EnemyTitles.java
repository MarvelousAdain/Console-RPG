package battlePackage;

import java.util.Random;

public enum EnemyTitles {
	// All possible Enemy Titles.
	Great("Great"), Destroyer("Destroyer"), Holy("Holy"), Unholy("Unholy"), Mountain("Mountain"), Dragon("Dragon"),
	Beast("Beast"), Hunter("Hunter"), Knight("Knight"), DKnight("Death Knight"), DestroyerOW("Destroyer of Worlds"),
	ConsumingC("Consuming Chaos"), Horror("Horror"), NightmareLord("Nightmare Lord"), GymBoss("Boss of the Gym"),
	LockerRoomLord("Lord of the Lockerroom"), SpawnoC("Spawn of Chaos"), DeKnight("Demon Knight"), DarkOne("Dark One"),
	Butcher("Butcher"), Seducer("Seducer"), LHero("Lost Hero"), FAngel("Fallen Angel"), GodSlayer("Slayer of Gods"),
	LostOne("Lost One"), Betrayer("Betrayer"), DHunter("Dragon Hunter"), DSlayer("Demon Slayer"),
	MasteroS("Master of Shadows");

	private String title;
	private static Random rnd = new Random();

	public String getTitle() {
		return title;
	}

	private EnemyTitles(String title) {
		this.title = title;
	}

	public static EnemyTitles getRandom() {
		return EnemyTitles.values()[rnd.nextInt(EnemyTitles.values().length)];
	}

}
