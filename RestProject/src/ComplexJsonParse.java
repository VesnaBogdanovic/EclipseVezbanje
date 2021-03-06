import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		JsonPath js = new JsonPath(Payload.CoursePrice());

		// Print number of courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println(count);

		// Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);

		// Print Title of the first course
		String titleFirstCourse = js.getString("courses[0].title");
		System.out.println(titleFirstCourse);

		// Print all course titles and their respective values
		for (int i = 0; i < count; i++) {
			String courseTitles = js.getString("courses[" + i + " ].title");
			System.out.println(js.get("courses[" + i + " ].price").toString());
		}

		// Print number of copies sold by RPA Course
		System.out.println("Print number of copies sold by RPA Course");
		for (int i = 0; i < count; i++) {
			String courseTitles = js.get("courses[" + i + "].title");
			if (courseTitles.equalsIgnoreCase("RPA")) {
				int copies = js.get("courses[" + i + "].copies");
				System.out.println(copies);
				break;
			}
		}
	}
}
