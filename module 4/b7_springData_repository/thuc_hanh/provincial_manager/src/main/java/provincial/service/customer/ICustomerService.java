package provincial.service.customer;

import org.springframework.stereotype.Service;
import provincial.model.Customer;
import provincial.model.Province;
import provincial.service.IGeneralService;


@Service
public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
