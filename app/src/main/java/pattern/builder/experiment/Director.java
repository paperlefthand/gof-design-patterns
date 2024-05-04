/**
 * Director Class
 */
package pattern.builder.experiment;

public class Director {
    /**
     * sample
     * @param builder 構成物
     */
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.addSolvent( 100 );
        builder.addSolute( 40 );
        builder.abandonSolution( 70 );
        builder.addSolvent( 100 );
        builder.addSolute( 15 );
    }
}
