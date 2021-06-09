package com.niroshan.demo.util;

import com.niroshan.demo.model.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentUtil {
    public static void calculateDtls(Student s) {
        //calculations
        //JDK 10 - LocalVariable Type Inference
        var fee = s.getStdFee();
        var disc = fee * 10/100.0;
        var gst = fee * 12/100.0;

        //set it back to same objecr
        s.setStdFeeDisc(disc);
        s.setStdFeeGst(gst);
    }
}
