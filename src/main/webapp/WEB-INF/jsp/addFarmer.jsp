<jsp:include page="modules/header.jsp" />

<!-- Start::app-content -->
<div class="main-content app-content">
    <div class="container-fluid my-5">
        <!-- Start:: row-1 -->
        <div class="row">
            <div class="col-xl-12">
                <div class="card custom-card">
                    <div class="card-header justify-content-between">
                        <div class="card-title">Add Farmer</div>
                    </div>
                    <div class="card-body">
                        <form action="/add" method="post">
                            <div class="row">
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="farmerId" class="form-label">Farmer ID</label>
                                        <input type="text" class="form-control" id="farmerId" name="farmerId" placeholder="Enter Your Id">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="name" class="form-label">Name</label>
                                        <input type="text" class="form-control" id="name" name="name" placeholder="Enter Your Name">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="date_of_registration" class="form-label">Date of Registration</label>
                                        <input type="text" class="form-control" id="date_of_registration" name="date_of_registration" placeholder="Register Your Date">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="contact" class="form-label">Contact</label>
                                        <div class="input-group">
                                            <div class="input-group-text">+91</div>
                                            <input type="text" class="form-control" id="contact" name="contact" placeholder="Enter Contact Number">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="route" class="form-label">Route</label>
                                        <input type="text" class="form-control" id="route" name="route" placeholder="Enter Your Area">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="address" class="form-label">Address</label>
                                        <input type="text" class="form-control" id="address" name="address" placeholder="Enter Your Address">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="status" class="form-label">Status</label>
                                        <input type="text" class="form-control" id="status" name="status" placeholder="Enter Your Status">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="branch" class="form-label">Branch</label>
                                        <input type="text" class="form-control" id="branch" name="branch" placeholder="Enter Your Branch">
                                    </div>
                                </div>
                                <div class="col-xl-12">
                                    <div class="mb-3">
                                        <label for="remark" class="form-label">Remark</label>
                                        <textarea class="form-control" id="remark" name="remark" rows="4"></textarea>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="dairy_bank" class="form-label">Dairy Bank Id</label>
                                        <input type="text" class="form-control" id="dairy_bank" name="dairyBank.id" placeholder="Enter Your dairy_bank_id">
                                    </div>
                                </div>
                                <div class="col-xl-12">
                                    <button class="btn btn-primary" type="submit">Submit</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer d-none border-top-0"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End::app-content -->

<jsp:include page="modules/footer.jsp" />
