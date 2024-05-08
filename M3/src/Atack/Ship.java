package Atack;
import interfacesProj.MilitaryUnit;
import interfacesProj.Variables;

abstract class Ship implements MilitaryUnit{
	private int armor;
	private int initialArmor;
	private int baseDamage;
	
	public Ship(int armor, int baseDamage) {
		this.armor = armor;
		this.initialArmor = armor;
		this.baseDamage = baseDamage;
	}
	
	public abstract int attack();

	@Override
	public void tekeDamage(int receivedDamage) {
		this.armor -= receivedDamage;
		if (this.armor < 0) {
			this.armor = 0;
		}
		
	}

	@Override
	public int getActualArmor() {
		return this.armor;
	}

	@Override
	public int getMetalCost() {
		return 0;
	}

	@Override
	public int getDeuteriumCost() {
		return 0;
	}

	@Override
	public int getChanceGeneratinWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getChanceAttackAgain() {
		return 0;
	}

	@Override
	public void resetArmor() {
		this.armor = this.initialArmor;
	}


	
}

class LightHunter extends Ship {
	
	public LightHunter(int armor, int baseDamage) {
		super(armor, baseDamage);
		
	}

	public LightHunter(int technologyLevel) {
		super(Variables.ARMOR_LIGTHHUNTER + technologyLevel * Variables.PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY, Variables.BASE_DAMAGE_LIGTHHUNTER);
	}
	
	@Override
	public int attack() {
		return 0;
	}

	@Override
	public int getMetalCost() {
		return Variables.METAL_COST_LIGTHHUNTER;
	}

	@Override
	public int getDeuteriumCost() {
		return super.getDeuteriumCost();
	}

	@Override
	public int getChanceGeneratinWaste() {
		return super.getChanceGeneratinWaste();
	}

	@Override
	public int getChanceAttackAgain() {
		return super.getChanceAttackAgain();
	}
	
	
}

class HeavyHunter extends Ship {
	
	public HeavyHunter (int armor, int baseDamage) {
		super(armor, baseDamage);
	}

	public HeavyHunter(int technologyLevel) {
		super(Variables.ARMOR_HEAVYHUNTER + technologyLevel * Variables.PLUS_ARMOR_HEAVYHUNTER_BY_TECHNOLOGY, Variables.BASE_DAMAGE_HEAVYHUNTER);
	}

	@Override
	public int attack() {
		return 0;
	}

	@Override
	public void tekeDamage(int receivedDamage) {
		super.tekeDamage(receivedDamage);
	}

	@Override
	public int getActualArmor() {
		return super.getActualArmor();
	}

	@Override
	public int getMetalCost() {
		return super.getMetalCost();
	}

	@Override
	public int getDeuteriumCost() {
		return super.getDeuteriumCost();
	}

	@Override
	public int getChanceGeneratinWaste() {
		return super.getChanceGeneratinWaste();
	}

	@Override
	public int getChanceAttackAgain() {
		return super.getChanceAttackAgain();
	}

	@Override
	public void resetArmor() {
		super.resetArmor();
	}
	
}

class BattleShip extends Ship {

	public BattleShip(int armor, int baseDamage) {
		super(armor, baseDamage);
	}

	public BattleShip(int technologyLevel) {
		super(Variables.ARMOR_BATTLESHIP + technologyLevel * Variables.PLUS_ARMOR_BATTLESHIP_BY_TECHNOLOGY, Variables.BASE_DAMAGE_BATTLESHIP);
	}


	@Override
	public int attack() {
		return 0;
	}

	@Override
	public void tekeDamage(int receivedDamage) {
		super.tekeDamage(receivedDamage);
	}

	@Override
	public int getActualArmor() {
		return super.getActualArmor();
	}

	@Override
	public int getMetalCost() {
		return super.getMetalCost();
	}

	@Override
	public int getDeuteriumCost() {
		return super.getDeuteriumCost();
	}

	@Override
	public int getChanceGeneratinWaste() {
		return super.getChanceGeneratinWaste();
	}

	@Override
	public int getChanceAttackAgain() {
		return super.getChanceAttackAgain();
	}

	@Override
	public void resetArmor() {
		super.resetArmor();
	}


	
}

class ArmoredShip extends Ship{

	public ArmoredShip(int armor, int baseDamage) {
		super(armor, baseDamage);
	}

	public ArmoredShip(int technologyLevel) {
		super(Variables.ARMOR_ARMOREDSHIP + technologyLevel * Variables.PLUS_ARMOR_ARMOREDSHIP_BY_TECHNOLOGY, Variables.BASE_DAMAGE_ARMOREDSHIP);
	}

	@Override
	public int attack() {
		return 0;
	}

	@Override
	public void tekeDamage(int receivedDamage) {
		super.tekeDamage(receivedDamage);
	}

	@Override
	public int getActualArmor() {
		return super.getActualArmor();
	}

	@Override
	public int getMetalCost() {
		return super.getMetalCost();
	}

	@Override
	public int getDeuteriumCost() {
		return super.getDeuteriumCost();
	}

	@Override
	public int getChanceGeneratinWaste() {
		return super.getChanceGeneratinWaste();
	}

	@Override
	public int getChanceAttackAgain() {
		return super.getChanceAttackAgain();
	}

	@Override
	public void resetArmor() {
		super.resetArmor();
	}

	
}
