package oops;
import java.util.Scanner;

    class pokemon{
        String type;
        int power;
        pokemon(String type,int power){
            this.type=type;
            this.power=power;
        }

        void print(){
            System.out.print(this.type+" "+this.power);
        }
        pokemon(){      //default constructor

        }
    }
    class legendary extends pokemon{
        String ability;
    }
    public class inheritance{
        public static void main(String[]args){
            legendary  mewtwo= new legendary();
            mewtwo.ability=" pressure";
            mewtwo.power =1;
            mewtwo.type="psychic";
            mewtwo.print();
            System.out.print(mewtwo.ability);
            godpokemon dialga=new godpokemon();
            dialga.ability="  loose  ";
            dialga.power =11;
            dialga.type="psychic";
            System.out.println();
            dialga.tag='c';
            dialga.print();
            System.out.print(dialga.ability+dialga.tag);
        }
    }
    class strong extends pokemon{
        int speed;
    }
    class godpokemon extends legendary{
        char tag;
    }


