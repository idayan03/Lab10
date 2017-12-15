/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     *name of the employee.
     */
    private String name;
    /**
     * the manager of an employee.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param name the name of the employee to create.
     * @param manager the manager of the employee.
     */
    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager
     */
    public void setManager(final String manager) {
        this.manager = manager;
    }
}
