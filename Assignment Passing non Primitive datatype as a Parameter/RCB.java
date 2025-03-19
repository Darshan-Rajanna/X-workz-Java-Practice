

class RCB {
    void namePlayer(Player player) {
        if (player != null) {
            player.inteam();
            System.out.println("Player is not null");
        } else {
            System.out.println("Player object is null, cannot add to the team");
        }
    }
    static class Player {
        void inteam() {
            System.out.println("Player is in the team RCB");
        }
    }
}