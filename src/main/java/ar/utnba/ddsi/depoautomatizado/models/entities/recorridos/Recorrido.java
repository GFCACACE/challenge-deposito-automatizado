package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos;

import java.util.List;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.ICommand;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Recorrido {
    public List<ICommand> comandos;
    public void ejecutarRecorrido(Robot robot) {
        comandos.forEach(comando -> comando.ejecutar(robot));

    }
} 