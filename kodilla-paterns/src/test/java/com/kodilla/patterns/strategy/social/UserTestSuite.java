package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new YGeneration("John", "Doe");
        User wick = new Millenials("John", "Wick");
        User jane = new ZGeneration("Jane", "Roe");

        //When
        String johnSharingWith = john.sharePost();
        System.out.println("John sharing with: " + johnSharingWith);
        String wickSharingWith = wick.sharePost();
        System.out.println("John Wick sharing with: " + wickSharingWith);
        String janeSharingWith = jane.sharePost();
        System.out.println("Jane sharing with: " + janeSharingWith);

        //Then
        Assert.assertEquals("Twitter", johnSharingWith);
        Assert.assertEquals("Snapchat", wickSharingWith);
        Assert.assertEquals("Facebook", janeSharingWith);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User wick = new Millenials("John", "Wick");

        //When
        String wickSharingWith = wick.sharePost();
        System.out.println("John Wick sharing with: " + wickSharingWith);
        wick.setSocialPublisher(new FacebookPublisher());
        wickSharingWith = wick.sharePost();
        System.out.println("Wick sharing with: " + wickSharingWith);

        //Then
        Assert.assertEquals("Facebook", wickSharingWith);
    }
}
