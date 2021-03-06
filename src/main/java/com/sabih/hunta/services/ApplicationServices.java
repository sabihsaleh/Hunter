package com.sabih.hunta.services;

import com.sabih.hunta.Model.Application;
import com.sabih.hunta.Repository.ApplicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ApplicationServices {

    public ApplicationRepository applicationRepository;

    public void createNewApplication(Application application) {
        applicationRepository.save(application);
    }

    public List<Application> listAllApplication() {
        return applicationRepository.findAll();

    }
}
