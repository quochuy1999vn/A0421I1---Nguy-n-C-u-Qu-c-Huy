package model.repository;

import model.bean.Service;

import java.util.List;

public interface ServiceRepository {
    boolean insertService(Service Service);

    Service selectService(int id);

    Service searchService(String name);

    boolean deleteService(int id);

    boolean updateService(Service Service);

    List<Service> selectAll();
}
