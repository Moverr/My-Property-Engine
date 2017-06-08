/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._controller;

import myproperty._entities.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty._entities.Address;
import myproperty._entities.responses.AddressResponse;
import myproperty._entities.responses.PersonResponse;
import myproperty._services.AddressService;
import myproperty._services.PersonService;
import myproperty.helper.ParentTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author CODE MOVERS
 * @version 1.0
 * @since 3/12/2017
 * @email moverr@gmail.com
 *
 */

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private AddressService addressService;

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<PersonResponse> getPeople() {
        return personService.getAllPeople();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonResponse getPersonById(@PathVariable("id") Integer id) throws Exception {
        return personService.getPersonById(id);
    }

    @RequestMapping(value = "userId/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonResponse> getPersonByUserId(@PathVariable("userId") Integer userId) throws Exception {
        return personService.getPersonByUserId(userId);
    }


    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonResponse updatePersonById(@RequestBody Person person, @PathVariable Integer id) throws Exception {
        LOG.log(Level.INFO, "Hit the Person Update Endpoint");
        return personService.updatePerson(id, person);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonResponse createPerson(@RequestBody Person person) throws Exception {
        LOG.log(Level.INFO, "Hit the Person Create Endpoint");
        return personService.createPerson(person);
    }

    @RequestMapping(value = "/{id}/createAddress", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AddressResponse createAddress(
            @RequestBody Address address,
            @PathVariable Integer id
    ) throws Exception {
        LOG.log(Level.INFO, " Create Address  Endpoint");
        return addressService.createAddress(address, ParentTypes.PERSON, id);
    }


}
