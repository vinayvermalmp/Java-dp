package org.example.dp.structural.facade;
/*
* One way to simplify the interactions between these subsystems while hiding their complexity is by using the Facade design pattern. In this pattern, a Facade class is created that acts as a single point of contact for the client code. The Facade class provides a simple, easy-to-use interface for the client code, while handling the interactions between the subsystems behind the scenes.

For example, you could create a UserFacade class that provides methods for user authentication, profile management, and preference management. The UserFacade class would encapsulate the interactions between the UserAuthentication, UserProfile, and UserPreference subsystems.

Here is some sample code to illustrate the implementation of the Facade pattern:
* */
public class UserFacade{
    private UserAuthentication userAuth = new UserAuthentication();
    private UserProfile userProfile = new UserProfile();
    private UserPreference userPref = new UserPreference();

    public boolean authenticate(String username, String password) {
        return userAuth.authenticate(username, password);
    }

    public void updateUserProfile(String username, UserProfileInfo info) {
        userProfile.updateUserProfile(username, info);
    }

    public void updateUserPreference(String username, UserPreferenceInfo info) {
        userPref.updateUserPreference(username, info);
    }

}

/*
* In this implementation, the UserFacade class provides a simple, easy-to-use interface for the client code to interact
* with the UserAuthentication, UserProfile, and UserPreference subsystems.
* The client code does not need to know the complexity of the interactions between these subsystems. The Facade class
* encapsulates this complexity, making the system easier to understand, maintain, and extend.
* */
