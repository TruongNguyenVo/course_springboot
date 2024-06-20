package Basis;

public class Third extends Second{
   
        //fields
        private int year_born;
        public Third(String name, int year_born){
            super(name);
            this.year_born = year_born;
        }
        public int sayAge(){
            return 2024 - this.year_born;
        }
    
}
