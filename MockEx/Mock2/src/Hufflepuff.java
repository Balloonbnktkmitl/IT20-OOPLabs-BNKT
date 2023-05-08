/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Hufflepuff extends Houses implements Magicable {

    public Hufflepuff() {
        super("Hufflepuff", "YELLOW");
    }

    @Override
    public void attackSpell(Player player, Player target, Spell spell) {
        target.setHp(target.getHp() - (spell.getDamage() + player.getAttackDamage()));
        if (spell instanceof Incendio) {
            player.setMana(player.getMana() - 3);
        } else if (spell instanceof Expelliarmus) {
            player.setMana(player.getMana() - 4);
        }
        System.out.println("[" + player.getName() + "]: use spell (" + spell.getName() + ")!");
    }

    @Override
    public void defense(Player player, Player damager) {
        player.setHp(player.getHp() + 4);
        player.setMana(player.getMana() + 3);
        System.out.println("[" + player.getName() + "]: Protego !");
    }

}
