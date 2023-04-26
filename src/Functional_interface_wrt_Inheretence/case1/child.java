package Functional_interface_wrt_Inheretence.case1;

@FunctionalInterface
public interface child extends parent{

}

// here parent and child are both functional interfaces
// they must have only on AM
// if parent interface is functional interface and child interface does not contain any AM
        // then child interface automatically becomes functional interface
// as child interface extends parent interface it will get AM of parent interface