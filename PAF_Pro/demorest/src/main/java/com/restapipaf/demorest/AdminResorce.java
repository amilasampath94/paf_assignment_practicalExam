package com.restapipaf.demorest;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("admins")
public class AdminResorce {

	AdminDAO repo = new AdminDAO();

	// GET client
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Admin> getAdmins() {
		System.out.println("getAdmin called...");

		return repo.getAdmins();
	}

	@GET
	@Path("admin/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Admin getAdmin(@PathParam("id") int id) {
		return repo.getAdmin(id);
	}

	// POST client
	@POST
	@Path("admin")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String createAdmin(@Valid Admin a1) {
		Admin a = repo.getAdmin(a1.getId());

		if (a.getId() == 0) {
			repo.create(a1);
			return "Successfully added the admin";
		} else {
			return "Admin Already exist";
		}

	}

	// UPDATE client
	@PUT
	@Path("admin")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String updateAdmin(@Valid Admin a1) {

		Admin a = repo.getAdmin(a1.getId());

		if (a.getId() == 0) {
			return "Admin is not exists,then can't update";
		} else {
			repo.update(a1);
			return "Successfully updated";
		}

	}

	// DELETE Client
	@DELETE
	@Path("admin/{id}")
	public String deleteAdmin(@PathParam("id") int id) {

		Admin a = repo.getAdmin(id);

		if (a.getId() == 0)
			return "admin is not exists,then cannot deleted";
		else {
			repo.delete(id);
			return "Successfully delete";
		}
	}

}
