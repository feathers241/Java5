package com.example.lab3.bai1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class ParamService {
	@Autowired
	HttpServletRequest request;
	
	// Đọc chuỗi giá trị của tham số
	public String getString(String name,String defaultValue) {
		String value = request.getParameter(name);
		return value != null ? value : defaultValue;
	}
	
	//Đọc chuỗi số nguyên của tham số
	public int getInt(String name, int defaultValue) {
		 try {
	            return Integer.parseInt(getString(name, String.valueOf(defaultValue)));
	        } catch (Exception e) {
	            return defaultValue;
	        }
	}
	
	// Đọc số thực
    public double getDouble(String name, double defaultValue) {
        try {
            String value = request.getParameter(name);
            return (value != null) ? Double.parseDouble(value) : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    // Đọc boolean
    public boolean getBoolean(String name, boolean defaultValue) {
        String value = request.getParameter(name);
        return (value != null) ? Boolean.parseBoolean(value) : defaultValue;
    }

    // Đọc ngày
    public Date getDate(String name, String pattern) {
        try {
            String value = request.getParameter(name);
            if (value == null) return null;
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.parse(value);
        } catch (Exception e) {
            throw new RuntimeException("Sai định dạng ngày!");
        }
    }

    // Lưu file upload
    public File save(MultipartFile file, String path) {
        try {
            if (file.isEmpty()) return null;
            String realPath = request.getServletContext().getRealPath(path);
            File dir = new File(realPath);
            if (!dir.exists()) dir.mkdirs();

            File savedFile = new File(dir, file.getOriginalFilename());
            file.transferTo(savedFile);

            return savedFile;
        } catch (Exception e) {
            throw new RuntimeException("Lỗi lưu file!");
        }
    }
}
