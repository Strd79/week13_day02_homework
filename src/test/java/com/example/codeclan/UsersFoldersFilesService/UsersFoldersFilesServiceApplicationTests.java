package com.example.codeclan.UsersFoldersFilesService;

import com.example.codeclan.UsersFoldersFilesService.models.File;
import com.example.codeclan.UsersFoldersFilesService.models.Folder;
import com.example.codeclan.UsersFoldersFilesService.models.User;
import com.example.codeclan.UsersFoldersFilesService.repositories.FileRepository;
import com.example.codeclan.UsersFoldersFilesService.repositories.FolderRepository;
import com.example.codeclan.UsersFoldersFilesService.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersFoldersFilesServiceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndSave() {
		User user = new User("David");
		userRepository.save(user);
	}

	@Test
	public void createFolderAndSave() {
		User user1 = new User("Kyle");
		userRepository.save(user1);

		Folder folder = new Folder("Holiday pics", user1);
		folderRepository.save(folder);
	}

	@Test
	public void createFileFolderUserAndSave() {
		User user2 = new User("Antonia");
		userRepository.save(user2);

		Folder folder2 = new Folder("Gym apps", user2);
		folderRepository.save(folder2);

		File file = new File("MyFitnessPal", "java", 88, folder2);
		fileRepository.save(file);
	}
}
