package MyQuizzer;

import org.junit.Test;

import org.junit.Assert;

//Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only
//Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only
//Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only
//Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please  RunMainPlayer.java Only   Please Run MainPlayer.java Only
//Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only
//Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only
//Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only  Please Run MainPlayer.java Only

public class JUnitFunTest extends MyQuizzer {

    @Test
    public void testPassword() {
        new MyQuizzer();
        Assert.assertTrue(MyQuizzer.passVerifier("@anshvikalp511"));
    }

    @Test
    public void testSetter() {
        MyQuizzer q = new MyQuizzer();
        q.setMcq();

        Assert.assertEquals(13, q.questions.size());
    }

}
