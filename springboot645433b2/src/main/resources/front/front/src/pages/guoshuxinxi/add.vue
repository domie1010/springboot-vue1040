<template>
<div :style='{"width":"100%","padding":"30px 10% 40px","margin":"0px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"border":"0px solid #e9e9e9","width":"100%","padding":"0px","margin":"0px 0","position":"relative","background":"#fff"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="果蔬名称" prop="guoshumingcheng">
            <el-input v-model="ruleForm.guoshumingcheng" 
                placeholder="果蔬名称" clearable :disabled=" false  ||ro.guoshumingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="果蔬类型" prop="guoshuleixing">
            <el-select v-model="ruleForm.guoshuleixing" placeholder="请选择果蔬类型" :disabled=" false  ||ro.guoshuleixing" >
              <el-option
                  v-for="(item,index) in guoshuleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="果蔬图片" v-if="type!='cross' || (type=='cross' && !ro.guoshutupian)" prop="guoshutupian">
            <file-upload
            tip="点击上传果蔬图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.guoshutupian?ruleForm.guoshutupian:''"
            @change="guoshutupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="果蔬图片" prop="guoshutupian">
                <img v-if="ruleForm.guoshutupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.guoshutupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.guoshutupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="生长阶段" prop="shengzhangjieduan">
            <el-select v-model="ruleForm.shengzhangjieduan" placeholder="请选择生长阶段" :disabled=" false  ||ro.shengzhangjieduan" >
              <el-option
                  v-for="(item,index) in shengzhangjieduanOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="种植数量" prop="zhongzhishuliang">
            <el-input v-model.number="ruleForm.zhongzhishuliang" 
                placeholder="种植数量" clearable :disabled=" false  ||ro.zhongzhishuliang"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="病虫害防治" prop="bingchonghaifangzhi">
            <el-input v-model="ruleForm.bingchonghaifangzhi" 
                placeholder="病虫害防治" clearable :disabled=" false  ||ro.bingchonghaifangzhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="施肥" prop="shifei">
            <el-input v-model.number="ruleForm.shifei" 
                placeholder="施肥" clearable :disabled=" false  ||ro.shifei"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="灌溉浇水" prop="guangaijiaoshui">
            <el-input v-model.number="ruleForm.guangaijiaoshui" 
                placeholder="灌溉浇水" clearable :disabled=" false  ||ro.guangaijiaoshui"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="播种时间" prop="bozhongshijian">
              <el-date-picker
				  :disabled=" false  ||ro.bozhongshijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.bozhongshijian" 
                  type="datetime"
                  placeholder="播种时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="果蔬场地" prop="guoshuchangdi">
            <el-input v-model="ruleForm.guoshuchangdi" 
                placeholder="果蔬场地" clearable :disabled=" false  ||ro.guoshuchangdi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="运输方式" prop="yunshufangshi">
            <el-input v-model="ruleForm.yunshufangshi" 
                placeholder="运输方式" clearable :disabled=" false  ||ro.yunshufangshi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="运输时间" prop="yunshushijian">
            <el-input v-model="ruleForm.yunshushijian" 
                placeholder="运输时间" clearable :disabled=" false  ||ro.yunshushijian"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="发布时间" prop="fabushijian">
              <el-date-picker
				  :disabled=" false  ||ro.fabushijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.fabushijian" 
                  type="datetime"
                  placeholder="发布时间">
              </el-date-picker>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#333","borderRadius":"0px","background":"#b4ebcc","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #eee","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#333","borderRadius":"0px","background":"none","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				guoshumingcheng : false,
				guoshuleixing : false,
				guoshutupian : false,
				shengzhangjieduan : false,
				zhongzhishuliang : false,
				bingchonghaifangzhi : false,
				shifei : false,
				guangaijiaoshui : false,
				bozhongshijian : false,
				guoshuchangdi : false,
				yunshufangshi : false,
				yunshushijian : false,
				fabushijian : false,
				discussnum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          guoshumingcheng: '',
          guoshuleixing: '',
          guoshutupian: '',
          shengzhangjieduan: '',
          zhongzhishuliang: '',
          bingchonghaifangzhi: '',
          shifei: '',
          guangaijiaoshui: '',
          bozhongshijian: '',
          guoshuchangdi: '',
          yunshufangshi: '',
          yunshushijian: '',
          fabushijian: '',
          discussnum: '',
        },
        guoshuleixingOptions: [],
        shengzhangjieduanOptions: [],


        rules: {
          guoshumingcheng: [
          ],
          guoshuleixing: [
          ],
          guoshutupian: [
          ],
          shengzhangjieduan: [
          ],
          zhongzhishuliang: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          bingchonghaifangzhi: [
          ],
          shifei: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          guangaijiaoshui: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          bozhongshijian: [
          ],
          guoshuchangdi: [
          ],
          yunshufangshi: [
          ],
          yunshushijian: [
          ],
          fabushijian: [
          ],
          discussnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.bozhongshijian = this.getCurDateTime()
      this.ruleForm.fabushijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='guoshumingcheng'){
              this.ruleForm.guoshumingcheng = obj[o];
              this.ro.guoshumingcheng = true;
              continue;
            }
            if(o=='guoshuleixing'){
              this.ruleForm.guoshuleixing = obj[o];
              this.ro.guoshuleixing = true;
              continue;
            }
            if(o=='guoshutupian'){
              this.ruleForm.guoshutupian = obj[o].split(",")[0];
              this.ro.guoshutupian = true;
              continue;
            }
            if(o=='shengzhangjieduan'){
              this.ruleForm.shengzhangjieduan = obj[o];
              this.ro.shengzhangjieduan = true;
              continue;
            }
            if(o=='zhongzhishuliang'){
              this.ruleForm.zhongzhishuliang = obj[o];
              this.ro.zhongzhishuliang = true;
              continue;
            }
            if(o=='bingchonghaifangzhi'){
              this.ruleForm.bingchonghaifangzhi = obj[o];
              this.ro.bingchonghaifangzhi = true;
              continue;
            }
            if(o=='shifei'){
              this.ruleForm.shifei = obj[o];
              this.ro.shifei = true;
              continue;
            }
            if(o=='guangaijiaoshui'){
              this.ruleForm.guangaijiaoshui = obj[o];
              this.ro.guangaijiaoshui = true;
              continue;
            }
            if(o=='bozhongshijian'){
              this.ruleForm.bozhongshijian = obj[o];
              this.ro.bozhongshijian = true;
              continue;
            }
            if(o=='guoshuchangdi'){
              this.ruleForm.guoshuchangdi = obj[o];
              this.ro.guoshuchangdi = true;
              continue;
            }
            if(o=='yunshufangshi'){
              this.ruleForm.yunshufangshi = obj[o];
              this.ro.yunshufangshi = true;
              continue;
            }
            if(o=='yunshushijian'){
              this.ruleForm.yunshushijian = obj[o];
              this.ro.yunshushijian = true;
              continue;
            }
            if(o=='fabushijian'){
              this.ruleForm.fabushijian = obj[o];
              this.ro.fabushijian = true;
              continue;
            }
            if(o=='discussnum'){
              this.ruleForm.discussnum = obj[o];
              this.ro.discussnum = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/guoshuleixing/guoshuleixing', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.guoshuleixingOptions = res.data.data;
          }
        });
        this.shengzhangjieduanOptions = "苗期,生长期,开花期,结果期".split(',')

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`guoshuxinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('guoshuxinxi/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`guoshuxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`guoshuxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      guoshutupianUploadChange(fileUrls) {
          this.ruleForm.guoshutupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 120px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ddd;
	  border-radius: 0px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: none;
	  width: 600px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
