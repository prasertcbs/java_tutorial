package com.prasertcbs;

/**
 * Created by prasert on 10/16/2014.
 */
public abstract class MemberCard {
    private String firstName, lastName;

    @Override
    public String toString() {
        return String.format("firstName = %s, lastName = %s", firstName, lastName);
//        return super.toString();
    }

    public MemberCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public MemberCard() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Overridable method
     * @param amount
     * @return
     */
    public float discount(float amount) {
        if (amount > 1000f) {
            return amount * .02f;
        } else {
            return 0f;
        }
    }

    // must implement this method in subclass
    public abstract float rewardXPoint();

    // subclass can't override this method
    public final int calcPoint(float amount) {
        return (int)((amount / 20) * rewardXPoint());
    }
}
