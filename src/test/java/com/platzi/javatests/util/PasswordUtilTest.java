package com.platzi.javatests.util;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

import com.platzi.javatests.util.PasswordUtil.SecurityLevel;
import org.junit.Test;

public class PasswordUtilTest {

  @Test
  public void weak_when_has_less_than_8_letters() {
      assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
  }

  @Test
  public void weak_when_has_less_than_only_letters() {
    assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
  }

  @Test
  public void medium_when_has_less_than_letters_and_numbers() {
    assertEquals(MEDIUM, PasswordUtil.assessPassword("abcddsfsadfsdf123423434234"));
  }

  @Test
  public void strong_when_has_less_than_letters_and_numbers() {
    assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
  }
}