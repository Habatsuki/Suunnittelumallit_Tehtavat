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
public class FlipUpCommand implements Command {
    private ProjectorScreen screen;
    public FlipUpCommand(ProjectorScreen screen) {
        this.screen = screen;
    }
    @Override // Command
    public void execute() {
        screen.pressUp();
    }
}