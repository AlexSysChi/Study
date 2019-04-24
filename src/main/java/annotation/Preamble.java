package annotation;

import java.lang.annotation.Documented;

@Documented // for appearing in javadoc
@interface Preamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}