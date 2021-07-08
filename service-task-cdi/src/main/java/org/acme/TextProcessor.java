package org.acme;

import javax.enterprise.context.ApplicationScoped;

/**
 * TextProcessor
 */
//Add CDI annotation here
@ApplicationScoped
public class TextProcessor {

//Add toUpper method here
public String toUpper(String text) {
    return text.toUpperCase();
  }
}