package subscribers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class SubscriberService {
    @Autowired SubsRepository repo;
     
    public void save(Subscriber subscriber) {
        repo.save(subscriber);
    }
     
    public List<Subscriber> listAll() {
        return (List<Subscriber>) repo.findAll();
    }
     
    public Subscriber get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }    
}