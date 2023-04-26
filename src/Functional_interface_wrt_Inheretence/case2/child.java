package Functional_interface_wrt_Inheretence.case2;

import Functional_interface_wrt_Inheretence.case1.parent;

@FunctionalInterface
public interface child extends parent {
    public void m1();
}

// here parent and child are both functional interfaces
// they must have only on AM
// if parent interface is functional interface and child interface contain same AM as of parent
    // it is valid
