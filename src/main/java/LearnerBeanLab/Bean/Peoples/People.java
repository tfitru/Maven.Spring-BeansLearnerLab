package LearnerBeanLab.Bean.Peoples;

import java.util.Collection;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    private List<PersonType> personList;
    private PersonType p;

    public People(PersonType p){
        this.p=p;
    }
    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public List<PersonType> getPersonList() {
        return personList;
    }

    public void setPersonList(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType p){
        personList.add(p);
    }

    public void remove(PersonType p){
        personList.remove(p);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personList){

        this.personList.addAll((Collection<? extends PersonType>) personList);
    }

    public PersonType findById(long id){
        for(int i =0; i< personList.size(); i++){
            if(personList.get(i).getId() == id){
                return personList.get(i);
            }
        }
        return null;
    }


    public List<PersonType> findAll(){
        return personList;
    }

}
