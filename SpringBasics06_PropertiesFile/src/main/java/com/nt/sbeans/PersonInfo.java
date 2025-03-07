package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pinfo")
@PropertySource(value="com/nt/commons/application.properties")
public class PersonInfo {
		@Value("${per.id}")
		private Integer pid;
		@Value("${per.name}")
		private String pname;
		@Value("${per.addrs}")
		private String addrs;
		@Value("9999999999")
		private Long mobileNo;
		
		@Value("${os.name}")
		private String os_name;
		@Value("${os.version}")
		private String os_ver;
		
		@Value("${path}")
		private String path_data;

		@Override
		public String toString() {
			return "PersonInfo [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", mobileNo=" + mobileNo
					+ ", os_name=" + os_name + ", os_ver=" + os_ver + ", path_data=" + path_data + "]";
		}
		
		
		
		
}
