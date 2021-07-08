package org.acme;

import org.acme.domain.Person;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

public class PersonUnit implements RuleUnitData {

    //Add Person DataStore here
    private DataStore<Person> persons = DataSource.createStore();

    //Add adultAge variable here
    private int adultAge;

    public PersonUnit() {

    }

    //Add DataStore Getters and Setters here
    public DataStore<Person> getPersons() {
        return persons;
    }

    public void setPersons(DataStore<Person> persons) {
        this.persons = persons;
    }
    //Add adultAge Getters and Setters here
    public int getAdultAge() {
        return adultAge;
    }

    public void setAdultAge(int adultAge) {
        this.adultAge = adultAge;
    }
}