package com.products.productinfo.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.products.productinfo.model.ProductDetails;

@Service
public class ProductDetailsService {

	String productJson = "[ { \"productId\":1, \"productName\":\"LeafRake\", \"productCode\":\"GDN-0011\", \"releaseDate\":\"March19,2016\", \"description\":\"Leafrakewith48-inchwoodenhandle.\", \"price\":19.95, \"starRating\":3.2, \"imageUrl\":\"http://openclipart.org/image/300px/svg_to_png/26215/Anonymous_Leaf_Rake.png\" }, { \"productId\":2, \"productName\":\"GardenCart\", \"productCode\":\"GDN-0023\", \"releaseDate\":\"March18,2016\", \"description\":\"15galloncapacityrollinggardencart\", \"price\":32.99, \"starRating\":4.2, \"imageUrl\":\"http://openclipart.org/image/300px/svg_to_png/58471/garden_cart.png\" }, { \"productId\":5, \"productName\":\"Hammer\", \"productCode\":\"TBX-0048\", \"releaseDate\":\"May21,2016\", \"description\":\"Curvedclawsteelhammer\", \"price\":8.9, \"starRating\":4.8, \"imageUrl\":\"http://openclipart.org/image/300px/svg_to_png/73/rejon_Hammer.png\" }, { \"productId\":8, \"productName\":\"Saw\", \"productCode\":\"TBX-0022\", \"releaseDate\":\"May15,2016\", \"description\":\"15-inchsteelbladehandsaw\", \"price\":11.55, \"starRating\":3.7, \"imageUrl\":\"http://openclipart.org/image/300px/svg_to_png/27070/egore911_saw.png\" }, { \"productId\":10, \"productName\":\"VideoGameController\", \"productCode\":\"GMG-0042\", \"releaseDate\":\"October15,2015\", \"description\":\"Standardtwo-buttonvideogamecontroller\", \"price\":35.95, \"starRating\":4.6, \"imageUrl\":\"http://openclipart.org/image/300px/svg_to_png/120337/xbox-controller_01.png\" } ]";

	public List<ProductDetails> getAllProducts() {
		ObjectMapper mapper = new ObjectMapper();
		List<ProductDetails> list = new ArrayList<ProductDetails>();

		try {
			list = mapper.readValue(productJson,
					mapper.getTypeFactory().constructCollectionType(List.class, ProductDetails.class));
			list.add(new ProductDetails("7", "Lawn Mower", "LDN-0101", "October20,2016", "Electric mower", 199.99, 3.5,
					"https://openclipart.org/download/141127/lawnMower.svg"));
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
