	import java.io.BufferedReader;
	import java.io.DataOutputStream;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.ProtocolException;
	import java.net.URL;
	import java.nio.charset.StandardCharsets;
	import java.util.ArrayList;

	public class Request {
		private static HttpURLConnection con;
		private String url = "http://jogosdeprogramacao.eu5.org/jogoDeGuerra.php";
		private ArrayList<String> urlParametersArray = new ArrayList<String>(); 
		

		public String sendRequest() throws MalformedURLException,ProtocolException, IOException{
			try {
				
				String urlParameters = String.join("&", urlParametersArray);
				byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);

				URL myurl = new URL(url);
				con = (HttpURLConnection) myurl.openConnection();

				con.setDoOutput(true);
				con.setRequestMethod("POST");
				con.setRequestProperty("User-Agent", "Java client");
				con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

				try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
					wr.write(postData);
				}

				StringBuilder content;

				try (BufferedReader in = new BufferedReader(
						new InputStreamReader(con.getInputStream()))) {

					String line;
					content = new StringBuilder();

					while ((line = in.readLine()) != null) {
						content.append(line);
						content.append(System.lineSeparator());
					}
				}

				return content.toString();

			} finally {

				con.disconnect();
				limparLista();
			}
		}
		
		public Request adicionaParametro(String key, String value) {
			urlParametersArray.add(String.format("%s=%s", key, value));
			return this;
		}
		
		private void limparLista() {
			urlParametersArray.clear();
		}
	}


