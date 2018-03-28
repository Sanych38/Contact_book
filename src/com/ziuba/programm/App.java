package com.ziuba.programm;

import com.ziuba.programm.view.CmdLineService;

public class App {
    public static void main(String[] args) {
        CmdLineService cmd = new CmdLineServiceImpl();
        cmd.showMenu();
    }
}
