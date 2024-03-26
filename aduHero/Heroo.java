package aduHero;

public class Heroo {
        private String nama;
        private double healthPoints;
        private double attack;
        private double defense;
    
        public Heroo(String nama, double healthPoints, double attack, double defense) {
            this.nama = nama;
            this.healthPoints = healthPoints;
            this.attack = attack;
            this.defense = defense;
        }
    
        public Heroo() {
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setHealthPoints(double healthPoints) {
            this.healthPoints = healthPoints;
        }
    
        public double getHealthPoints() {
            return healthPoints;
        }
    
        public void setAttack(double attack) {
            this.attack = attack;
        }
    
        public double getAttack() {
            return attack;
        }
    
        public void setDefense(double defense) {
            this.defense = defense;
        }
    
        public double getDefense() {
            return defense;
        }
    
        public void attack(Heroo enemy) {
            double damage = this.attack - enemy.getDefense();
            if (damage > 0) {
                enemy.setHealthPoints(enemy.getHealthPoints() - damage);
                System.out.println(this.nama + " menyerang " + enemy.getNama() + " dan menyebabkan " + damage + " kerusakan.");
            } else {
                System.out.println(this.nama + " gagal menyebabkan kerusakan kepada " + enemy.getNama() + ".");
            }
        }
    }
    
