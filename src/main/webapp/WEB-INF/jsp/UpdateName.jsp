<jsp:include page="modules/header.jsp" />

<!-- Start::app-content -->
<div class="main-content app-content">
    <div class="container-fluid my-5">
        <!-- Start:: row-1 -->
        <div class="row">
            <div class="col-xl-12">
                <div class="card custom-card">
                    <div class="card-header justify-content-between">
                        <div class="card-title">Update Farmer</div>
                    </div>
                    <div class="card-body">
                       <form action="/update" method="post">
    <div class="row">
        <div class="col-xl-6">
            <div class="mb-3">
                <label for="id" class="form-label">Farmer ID</label>
                <input type="text" class="form-control" id="id" name="id" placeholder="Enter Your Id">
            </div>
        </div>
        <div class="col-xl-6">
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Enter Your Name">
            </div>
        </div>
    </div>
    <div class="col-xl-12">
        <button class="btn btn-primary" type="submit">Update</button>
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
