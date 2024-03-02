package org.example.service;

import org.example.constants.Commands;
import org.example.repository.UserRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InMemoryService {
public InMemoryService() {
    UserRepository userRepository=new UserRepository();
    try{
        Files.deleteIfExists(Paths.get(Commands.outputFilePath));
        Files.createFile(Paths.get(Commands.outputFilePath));
    }
    catch (Exception e){
        System.out.println(e);
    }

}

}
