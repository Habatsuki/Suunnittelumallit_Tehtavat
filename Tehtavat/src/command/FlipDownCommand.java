/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author hannu.korhonen
 */
public class FlipDownCommand implements Command {
    private ProjectorScreen screen;
    
    public FlipDownCommand(ProjectorScreen screen) {
        this.screen = screen;
    }
    
    @Override // Command
    public void execute() {
        screen.pressDown();
    }
}