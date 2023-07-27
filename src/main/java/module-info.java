module dev.mccue.guava.io {
    requires static com.google.errorprone.annotations;
    requires static dev.mccue.jsr305;
    requires static org.checkerframework.checker.qual;

    requires transitive dev.mccue.guava.base;
    requires transitive dev.mccue.guava.collect;
    requires transitive dev.mccue.guava.hash;
    requires transitive dev.mccue.guava.graph;
    requires dev.mccue.guava.math;
    requires dev.mccue.guava.primitives;

    exports dev.mccue.guava.io;
}