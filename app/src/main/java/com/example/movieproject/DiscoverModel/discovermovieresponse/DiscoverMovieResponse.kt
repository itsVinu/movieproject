package com.example.movieproject.DiscoverModel.discovermovieresponse

import com.google.gson.annotations.SerializedName

data class DiscoverMovieResponse(

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("total_pages")
	val totalPages: Int? = null,

	@field:SerializedName("results")
	val results: List<ResultsItem>? = null,

	@field:SerializedName("total_results")
	val totalResults: Int? = null
)