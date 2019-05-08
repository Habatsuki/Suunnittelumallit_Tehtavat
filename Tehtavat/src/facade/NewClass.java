/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.Arrays;

/**
 *
 * @author hannu.korhonen
 */

/* Complex parts */
class CPU {
    public void freeze() { System.out.println("nice to freeze you"); }
    public void jump(long position) { System.out.println("jumping into " + position); }
    public void execute() { System.out.println("execute"); }
}

class HardDrive {
    public byte[] read(long lba, int size) { 
        byte[] b = new byte[size];
        b[3] = (byte) (lba + size);
        return b;
    }
}

class Memory {
    public void load(long position, byte[] data) {
         System.out.println("loading from position");
         System.out.println("position is " + position + " to " + Arrays.toString(data));
    }
}

/* Facade */
class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(5, hd.read(2, 7));
        processor.jump(3);
        processor.execute();
    }
}

/* Client */
class You {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
