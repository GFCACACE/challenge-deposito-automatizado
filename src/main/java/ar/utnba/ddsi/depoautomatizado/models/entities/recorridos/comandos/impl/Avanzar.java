package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.impl;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.ICommand;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Avanzar implements ICommand {

    @Override
    public void ejecutar(Robot robot) {
        robot.avanzar();
    }
}
