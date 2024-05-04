/**
 * Builder Interface
 */

package pattern.builder.experiment;

public interface Builder {

    public void addSolute(float soluteAmount);
    public void addSolvent(float solventAmount);
    public void abandonSolution(float solutionAmount);
    public Object getResult();
}
