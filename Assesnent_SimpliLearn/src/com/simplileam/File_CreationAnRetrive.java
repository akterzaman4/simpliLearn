package com.simplileam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class File_CreationAnRetrive {

	File file;
	String fileName;

	public File_CreationAnRetrive(String fileName) {
		this.fileName = fileName;

	}

	private void createFile() {
		try {
			file = new File(fileName);
			file.createNewFile();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		} 

	}

	public void retriveFileNameAccending() {
		createFile();
		if (file.isDirectory()) {
			// String fileNames[]= file.list();
			List<String> fileNames = Arrays.asList(file.list());
			if (fileNames != null) {
				Collections.sort(fileNames);
				System.out.println("Sorting by filename in ascending order");
				for (String fileName : fileNames) {
					System.out.println(fileName);
				}

				System.out.println("Sorting by filename in descending order");
				Collections.sort(fileNames, Collections.reverseOrder());
				for (String s : fileNames) {
					System.out.println(s);
				}
			}

		} else {
			System.out.println("file is not exist");
		}

	}

	public boolean searchFileByName(String fileName) {
		boolean isFileExist = false;
		if (file == null) {
			createFile();

			List<String> fileNames = Arrays.asList(file.list());
			if (fileNames != null) {
				for (String name : fileNames) {
					
					if (name.contains(fileName)) {
						System.out.println("file is found:" + fileName);
						isFileExist = true;
						break;
					} else {
						System.out.println("file name: "+fileName +" is not  matchd  with :"+name);
						isFileExist = false;
					}
				}

			}else {
				
			}
		}
		return isFileExist;
	}

	
}
