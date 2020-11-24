package com.example.codeclan.UsersFoldersFilesService.components;

import com.example.codeclan.UsersFoldersFilesService.models.File;
import com.example.codeclan.UsersFoldersFilesService.models.Folder;
import com.example.codeclan.UsersFoldersFilesService.models.User;
import com.example.codeclan.UsersFoldersFilesService.repositories.FileRepository;
import com.example.codeclan.UsersFoldersFilesService.repositories.FolderRepository;
import com.example.codeclan.UsersFoldersFilesService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User david = new User("David");
        userRepository.save(david);
        User kyle = new User("Kyle");
        userRepository.save(kyle);
        User ewen = new User("Ewen");
        userRepository.save(ewen);

        Folder class_files = new Folder("Class Work files", david);
        folderRepository.save(class_files);
        Folder pics = new Folder("Hong Kong pics", kyle);
        folderRepository.save(pics);
        Folder music = new Folder("Kyle's fav music", kyle);
        folderRepository.save(music);
        Folder dog_pics = new Folder("Pics of Lux", ewen);
        folderRepository.save(dog_pics);
        Folder fitness = new Folder("My fitness apps", ewen);
        folderRepository.save(fitness);
        Folder music2 = new Folder("Ewen's fav music", ewen);
        folderRepository.save(music2);

        File java = new File("My Java file", "java", 34, class_files);
        fileRepository.save(java);
        File java2 = new File("David's other Java file", "java", 88, class_files);
        fileRepository.save(java2);
        File hk = new File("Kyle's home in HK", "jpeg", 156, pics);
        fileRepository.save(hk);
        File hk2 = new File("HK island", "jpeg", 134, pics);
        fileRepository.save(hk2);
        File one_d = new File("One Direction's no. one", "mp3", 134, music);
        fileRepository.save(one_d);
        File lux = new File("Lux at 6 months old", "jpeg", 178, dog_pics);
        fileRepository.save(lux);
        File fitpal = new File("My Fitness Pal", "java", 234, fitness);
        fileRepository.save(fitpal);
        File kylie = new File("I Should Be So Lucky", "mp3", 98, music2);
        fileRepository.save(kylie);
    }
}
