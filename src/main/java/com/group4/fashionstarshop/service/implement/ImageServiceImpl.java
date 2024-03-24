package com.group4.fashionstarshop.service.implement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.group4.fashionstarshop.model.ProductImage;
import com.group4.fashionstarshop.repository.ImageRepository;
import com.group4.fashionstarshop.service.ImageService;

import io.netty.util.internal.StringUtil;
import io.swagger.v3.oas.models.Paths;

@Service
public class ImageServiceImpl implements ImageService{
	@Autowired
	 private ImageRepository imageRepository;
	@Override
	public ProductImage save(MultipartFile file) throws Exception {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new Exception("Sorry! Filename contains invalid path sequence " + fileName);
            }

            ProductImage image = new ProductImage();
            image.setProductName(fileName);

            // Save the file in the uploads directory
            Path uploadDir = java.nio.file.Paths.get("uploads");
            if (!Files.exists(uploadDir)) {
                Files.createDirectories(uploadDir);
            }
            Path filePath = uploadDir.resolve(fileName);
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            // Save the file path in the Image model
            image.setImagePath(filePath.toString());

            // Save the Image model to the database
            return imageRepository.save(image);

        } catch (IOException ex) {
            throw new Exception("Could not store file " + fileName + ". Please try again!", ex);
        }
	}

}
